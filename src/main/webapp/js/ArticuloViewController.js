'use strict';

module.controller('ArticuloViewCtrl', ['$scope', '$filter', '$http', '$rootScope', function($scope, $filter, $http, $rootScope) {
    //listar
    $scope.lista = [];
    $scope.listaPalabraClave = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;

    $scope.visto = function() {
        //            $scope.datosFormulario.texto = $('#texto').froalaEditor('html.get');
        //            console.log($scope.datosFormulario.texto);
        //            $scope.toBase64();
        console.log(JSON.stringify($scope.tags));
    };

    $scope.listar = function() {
        $http.get('http://localhost:8080/periodico-1.0/webresources/Articulo', {})
            .success(function(data, status, headers, config) {
                $scope.lista = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };

    $scope.listarPalabraClave = function() {
        $http.get('http://localhost:8080/periodico-1.0/webresources/Tag', {})
            .success(function(data, status, headers, config) {
                $scope.listaPalabraClave = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de palabraClave, por favor intente m\xe1s tarde');
            });
    };
    $scope.listarPalabraClave();

    $scope.listarSeccion = function() {
        $http.get('http://localhost:8080/periodico-1.0/webresources/Seccion', {})
            .success(function(data, status, headers, config) {
                $scope.listaSeccion = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de seccion, por favor intente m\xe1s tarde');
            });
    };
    $scope.listarSeccion();


    $scope.listar();
    
    $scope.crear =function(option){
        $rootScope.articulo=option;
        console.log("hooooo");
            console.log(JSON.stringify($rootScope.articulo));
//      $('#tituloArticulo').value=option.nombre;
//      $('#contenidoArticulo').append(option.texto);
//      $('#palabrasClaveArticulo').value=option.tags;
    };
    
}]);