![image](https://github.com/user-attachments/assets/3c9fa260-3110-4a9d-bf86-67974321f933)


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SAP Database Tables</title>
</head>
<body>
    <hr style="height: 2px; background-color: black; border: none;">
    학교 캡스톤 디자인 Jco Test
    <ul>
        <li> SAP GUI 연결 (SE37) 사용</li>
        <li> 라즈베리파이에서 데이터 -> 파이어베이스 <--> 자바 <--> sap gui</li>
    </ul>
    <hr style="height: 2px; background-color: black; border: none;">
    <h3>ZYC_DB_PRODUCT Table</h3>
    <table style="width: 100%; border-collapse: collapse; margin-bottom: 20px; border: 1px solid black;">
        <thead>
            <tr>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Field</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Key</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Data Element</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Data Type</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Length</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Short Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">MANDT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Yes</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">MANDT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CLNT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">3</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Client</td>
            </tr>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">LOT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Yes</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">ZYC_PROD_LOT_NO_043</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CHAR</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">12</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Lot Number</td>
            </tr>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">MEDIUM</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">No</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">ZYC_PROD_MEDIUM</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CHAR</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">6</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Medium</td>
            </tr>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">PROD_DATE</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">No</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">ZYC_PROD_DATE_043</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">DATS</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">8</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Product Date</td>
            </tr>
        </tbody>
    </table>
    <hr style="height: 2px; background-color: black; border: none;">
    <h3>ZYC_DB_SEED Table</h3>
    <table style="width: 100%; border-collapse: collapse; margin-bottom: 20px; border: 1px solid black;">
        <thead>
            <tr>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Field</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Key</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Data Element</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Data Type</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Length</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Short Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">MANDT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Yes</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">MANDT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CLNT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">3</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Client</td>
            </tr>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CODE</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Yes</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">ZYC_SEED_CODE_043</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CHAR</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">15</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Seed Code</td>
            </tr>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">NAME</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">No</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">ZYC_SEED_NAME_043</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CHAR</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">15</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Seed Name</td>
            </tr>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">GROUPUP</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">No</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">ZYC_SEED_GROW_043</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">INT4</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">10</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Seed Growth Group</td>
            </tr>
        </tbody>
    </table>
    <hr style="height: 2px; background-color: black; border: none;">
    <h3>ZYC_DB_PLANT Table</h3>
    <table style="width: 100%; border-collapse: collapse; margin-bottom: 20px; border: 1px solid black;">
        <thead>
            <tr>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Field</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Key</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Data Element</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Data Type</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Length</th>
                <th style="border: 1px solid black; padding: 10px; background-color: #f2f2f2; text-align: left;">Short Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">MANDT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Yes</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">MANDT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">CLNT</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">3</td>
                <td style="border: 1px solid black; padding: 10px; text-align: left;">Client</td>
            </tr>
        </tbody>
    </table>
</body>
</html>
