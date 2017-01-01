var cy = cytoscape({

    container: document.getElementById('cy'), // container to render in
    style: [ // the stylesheet for the graph
        {
            selector: 'node',
            style: {
                'width': 50,
                'height': 50,
                'label': 'data(id)',
                'background-color': '#00BFFF',
                "text-valign": "center",
                "text-halign": "center"
            }
        },
        {
            selector: 'edge',
            style: {
                'width': 5,
                'line-color': 'data(color)',
                'label': 'data(qty)',
                'text-margin-x': 15,
                'text-margin-y': 15,
                'target-arrow-color': 'data(color)',
                'target-arrow-shape': 'triangle',
                'curve-style': 'bezier',
                'control-point-step-size': 100

            }
        }
    ],

    layout: {
        name: 'circle'
    }
});
$.getJSON("./getDaysNumber", function (data) {
    numDays = data["days"];
    $.ajax({
        url: './graphData',
        dataType: 'json',
        async: false,
        data: {
            day: 100
        },
        success: function (moves) {
            locationsIds = new Array();
            for (var i = 0; i < moves.length; i++) {
                if (locationsIds.indexOf(moves[i].location1CODE) < 0)
                    locationsIds.push(moves[i].location1CODE);
                if (locationsIds.indexOf(moves[i].location2CODE) < 0)
                    locationsIds.push(moves[i].location2CODE);
            }

            var elems = new Array();
            for (var i = 0; i < locationsIds.length; i++) {
                elems.push({
                    data: {id: locationsIds[i]}
                })
            }
            //Edges
            for (var i = 0; i < moves.length; i++) {
                elems.push({
                    data: {
                        id: moves[i].location1CODE + '_' + moves[i].location2CODE,
                        source: moves[i].location1CODE,
                        target: moves[i].location2CODE,
                        color: moves[i].type == "Healthy" ? "#00ff00" : moves[i].type == "Repair" ? "#ffff00" : "#ff0000",
                        qty: moves[i].quantity
                    }
                })
            }
            cy.json({elements: elems});
            cy.layout({
                name: 'circle'
            });
        }
    });
});
// $.ajax({
//     url: '/getDaysNumber',
//     dataType: 'json',
//     async: false,
//     data: {
//         day: 140
//     },
//     success: function (data) {
//         alert(data[0]);
//     }
// });
// cy.elements().remove();
// cy.json({ elements: newEleJsons });