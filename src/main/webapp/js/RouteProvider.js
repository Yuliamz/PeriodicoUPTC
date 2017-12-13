'use strict';


// Declare app level module which depends on filters, and services
var app = angular.module('adminPeriodico', [
    'ngRoute',
    'angularUtils.directives.dirPagination',
    'adminPeriodico.controllers'
]);
app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/', { templateUrl: 'partials/ArticuloView.html', controller: 'ArticuloViewCtrl' });
    $routeProvider.when('/Seccion', { templateUrl: 'partials/Seccion.html', controller: 'SeccionCtrl' });
    $routeProvider.when('/Articulo', { templateUrl: 'partials/Articulo.html', controller: 'ArticuloCtrl' });
    $routeProvider.when('/ArticuloSeccion', { templateUrl: 'partials/ArticuloViewFilter.html', controller: 'ArticuloViewFilterCtrl' });
    $routeProvider.when('/Tag', { templateUrl: 'partials/Tag.html', controller: 'TagCtrl' });
    $routeProvider.when('/ver', { templateUrl: 'partials/ver.html', controller: 'VerCtrl' });

    $routeProvider.otherwise({ redirectTo: '/' });
}]);

app.controller('MainCtrl', ['$scope', '$http', function($scope, $http) {
    $scope.listarSeccion = function() {
            console.log("hieee");
        $http.get('http://localhost:8080/periodico-1.0/webresources/Seccion', {})
            .success(function(data, status, headers, config) {
                $scope.listaSeccion = data;
            }).error(function(data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de seccion, por favor intente m\xe1s tarde');
            });
    };
    $scope.listarSeccion();


    
}]);

var module = angular.module("adminPeriodico.controllers", []);