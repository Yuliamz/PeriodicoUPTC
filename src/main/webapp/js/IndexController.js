'use strict';

module.controller('IndexCtrl', ['$scope', '$filter', '$http', '$rootScope', function($scope, $filter, $http, $rootScope) {
    $scope.listarSeccion = function() {
        $http.get('http://localhost:8080/periodico-1.0/webresources/Seccion', {})
            .success(function(data, status, headers, config) {
                $scope.listaSeccion = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de seccion, por favor intente m\xe1s tarde');
            });
    };
    $scope.listarSeccion();

    $scope.guardarSeccion = function(seccion){
        $rootScope.seccion = seccion;
    };

    
}]);