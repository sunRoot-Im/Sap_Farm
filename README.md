학교 캡스톤 디자인 Jco Test
<ul>
    <li> SAP GUI 연결 (SE37) 사용
</ul>

<h1>ZYC_DB_PRODUCT Table</h1>
    <table>
        <thead>
            <tr>
                <th>Field</th>
                <th>Key</th>
                <th>Data Element</th>
                <th>Data Type</th>
                <th>Length</th>
                <th>Short Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>MANDT</td>
                <td>Yes</td>
                <td>MANDT</td>
                <td>CLNT</td>
                <td>3</td>
                <td>Client</td>
            </tr>
            <tr>
                <td>LOT</td>
                <td>Yes</td>
                <td>ZYC_PROD_LOT_NO_043</td>
                <td>CHAR</td>
                <td>12</td>
                <td>Lot Number</td>
            </tr>
            <tr>
                <td>MEDIUM</td>
                <td>No</td>
                <td>ZYC_PROD_MEDIUM</td>
                <td>CHAR</td>
                <td>6</td>
                <td>Medium</td>
            </tr>
            <tr>
                <td>PROD_DATE</td>
                <td>No</td>
                <td>ZYC_PROD_DATE_043</td>
                <td>DATS</td>
                <td>8</td>
                <td>Product Date</td>
            </tr>
        </tbody>
    </table>

<h1>ZYC_DB_SEED Table</h1>
    <table>
        <thead>
            <tr>
                <th>Field</th>
                <th>Key</th>
                <th>Data Element</th>
                <th>Data Type</th>
                <th>Length</th>
                <th>Short Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>MANDT</td>
                <td>Yes</td>
                <td>MANDT</td>
                <td>CLNT</td>
                <td>3</td>
                <td>Client</td>
            </tr>
            <tr>
                <td>CODE</td>
                <td>Yes</td>
                <td>ZYC_SEED_CODE_043</td>
                <td>CHAR</td>
                <td>15</td>
                <td>Seed Code</td>
            </tr>
            <tr>
                <td>NAME</td>
                <td>No</td>
                <td>ZYC_SEED_NAME_043</td>
                <td>CHAR</td>
                <td>15</td>
                <td>Seed Name</td>
            </tr>
            <tr>
                <td>GROUPUP</td>
                <td>No</td>
                <td>ZYC_SEED_GROW_043</td>
                <td>INT4</td>
                <td>10</td>
                <td>Seed Growth Group</td>
            </tr>
        </tbody>
    </table>

<h1>ZYC_DB_PLANT Table</h1>
    <table>
        <thead>
            <tr>
                <th>Field</th>
                <th>Key</th>
                <th>Data Element</th>
                <th>Data Type</th>
                <th>Length</th>
                <th>Short Description</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>MANDT</td>
                <td>Yes</td>
                <td>MANDT</td>
                <td>CLNT</td>
                <td>3</td>
                <td>Client</td>
            </tr>
        </tbody>
    </table>
