(function() {
    'use strict';

    angular
        .module('jhdummyApp')
        .controller('LocationMySuffixDetailController', LocationMySuffixDetailController);

    LocationMySuffixDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Location', 'Country'];

    function LocationMySuffixDetailController($scope, $rootScope, $stateParams, previousState, entity, Location, Country) {
        var vm = this;

        vm.location = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('jhdummyApp:locationUpdate', function(event, result) {
            vm.location = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
