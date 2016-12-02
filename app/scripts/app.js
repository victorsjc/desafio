(function () {
    'use strict';
	
	var app = angular.module('myApp', ['ngRoute']);
	app.controller('desafioCtrl', function($scope, $http) {
        var actionUrl = 'http://localhost:8080/api/extrato',
                load = function () {
                    $http.get(actionUrl)
                            .success(function (data) {
                                $scope.lancamentos = data.lancamentos;
                            });
                };

        load();	
	
	});
	
})();