package JcoTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.sap.conn.jco.AbapException;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoTable;
import com.sap.conn.jco.ext.DestinationDataProvider;

public class FirstJcoTest {

    private static List<Map<String, Object>> list = null;  // 조회된 데이터를 담을 리스트

    static String ABAP_AS = "hiccgdf";  // SAP 연결명

    // SAP 연결 구성 파일 생성 메서드
    static void createDestinationDataFile(String destinationName, Properties connectProperties) {
        File destCfg = new File(destinationName + ".jcoDestination");

        if (!destCfg.exists()) {
            try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(destCfg, false), "UTF-8")) {
                connectProperties.store(writer, "for tests only !");
            } catch (IOException e) {
                throw new RuntimeException("Unable to create the destination files", e);
            }
        }
    }

    public static void getTableTest() throws JCoException {
        System.out.println("SAP JCo를 통해 데이터 가져오기 시작");

        JCoDestination destination = JCoDestinationManager.getDestination(ABAP_AS);

        // 연결 정보 출력
        System.out.println("Attributes:");
        System.out.println(destination.getAttributes());
        System.out.println();

        // 원격 펑션 모듈 호출
        JCoFunction function = destination.getRepository().getFunction("ZABAP_047_JTEST");
        if (function == null) {
            throw new RuntimeException("SAP에서 ZABAP_047_JCOTEST 함수를 찾을 수 없습니다.");
        }

        try {
           // Import 파라미터 설정 (필요하다면)
           function.getImportParameterList().setValue("IM_DATA", "안녕222");

           // SAP 함수 실행
           function.execute(destination);
           System.out.println("SAP 함수 실행 완료!");

           // Export 파라미터에서 값 가져오기
           String exportData = function.getExportParameterList().getString("EV_DATA");
           String exportData2 = function.getExportParameterList().getString("EV_DATA2");
           System.out.println("SAP로부터 받은 TEXT: " + exportData + '\n' + exportData2);

        } catch (AbapException e) {
            System.out.println(e.toString());
            return;
        }

        // 테이블 데이터를 가져오는 경우
        JCoTable table = function.getTableParameterList().getTable("GT_DATA");

        if (table == null) {
            System.out.println("지정된 이름의 테이블이 없습니다.");
            return;
        }

        list = new ArrayList<>();

        // 테이블 데이터 읽어오기
        for (int i = 0; i < table.getNumRows(); i++) {
            table.setRow(i);
            Map<String, Object> map = new HashMap<>();

            map.put("CARRID", table.getString("CARRID"));
            map.put("CONNID", table.getString("CONNID"));
            map.put("FLDATE", table.getString("FLDATE"));

            // 리스트에 데이터 추가
            list.add(map);
        }

        // 조회된 테이블 데이터 출력
        System.out.println("조회된 테이블 데이터: " + list);
    }

    public static void main(String[] args) {
        System.out.println("SAP JCo 연결 시작");

        // 연결 프로퍼티 생성
        Properties connectProperties = new Properties();

        connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST, "AB4.UCC.UWM.EDU");  // SAP 호스트 정보
        connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR, "00");  // 인스턴스 번호
        connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT, "519");  // SAP 클라이언트
        connectProperties.setProperty(DestinationDataProvider.JCO_USER, "ZU-047");  // SAP 유저명
        connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD, "@dlagorms1");  // SAP 패스워드
        connectProperties.setProperty(DestinationDataProvider.JCO_LANG, "EN");  // 언어

        // 연결 파일 생성
        createDestinationDataFile(ABAP_AS, connectProperties);

        try {
            getTableTest();
        } catch (JCoException e) {
            System.out.println("SAP 연결 또는 데이터 조회 중 오류 발생: " + e.getMessage());
        }
    }
}
