<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SAP Database Tables</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    학교 캡스톤 디자인 Jco Test
    <ul>
        <li> SAP GUI 연결 (SE37) 사용
        <li> 라즈베리파이에서 데이터 -> 파이어베이스 <--> 자바 <--> sap gui
    </ul>
    <h3>ZYC_DB_PRODUCT Table</h3>
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
    <h3>ZYC_DB_SEED Table</h3>
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
    <h3>ZYC_DB_PLANT Table</h3>
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
</body>
</html>

