


$(document).ready(function() {
    $('#example').DataTable({
        "language": {
            "sProcessing": "Procesando...",
            "sLengthMenu": "Mostrar _MENU_ registros",
            "sZeroRecords": "No se encontraron resultados",
            "sEmptyTable": "Ningún dato disponible en esta tabla",
            "sInfo": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
            "sInfoEmpty": "Mostrando registros del 0 al 0 de un total de 0 registros",
            "sInfoFiltered": "(filtrado de un total de _MAX_ registros)",
            "sInfoPostFix": "",
            "sSearch": "Buscar:",
            "sUrl": "",
            "sInfoThousands": ",",
            "sLoadingRecords": "Cargando...",
            "oPaginate": {
                "sFirst": "Primero",
                "sLast": "Último",
                "sNext": "Siguiente",
                "sPrevious": "Anterior"
            },
            "oAria": {
                "sSortAscending": ": Activar para ordenar la columna de manera ascendente",
                "sSortDescending": ": Activar para ordenar la columna de manera descendente"
            },
            "buttons": {
                "copy": "Copiar",
                "colvis": "Visibilidad"
            }
        }
    });
    function exportToCsv() {
        const table = document.getElementById('example');
        const rows = table.getElementsByTagName('tr');
        const csvContent = [];


        const headers = [];
        for (const th of rows[0].querySelectorAll('th')) {
            headers.push(th.innerText);
        }
        csvContent.push(headers.join(','));


        for (let i = 1; i < rows.length; i++) {
            const rowData = [];
            for (const td of rows[i].querySelectorAll('td')) {
                rowData.push(td.innerText);
            }
            csvContent.push(rowData.join(','));
        }


        const csvBlob = new Blob([csvContent.join('\n')], { type: 'text/csv;charset=UTF-8' });  // Agrega 'charset=UTF-8'
        const csvUrl = URL.createObjectURL(csvBlob);
        const downloadLink = document.createElement('a');
        downloadLink.href = csvUrl;
        downloadLink.download = 'tabla.csv';
        document.body.appendChild(downloadLink);
        downloadLink.click();
        document.body.removeChild(downloadLink);
    }


    const exportCsvBtn = document.getElementById('exportCsvBtn');
    exportCsvBtn.addEventListener('click', exportToCsv);



});


