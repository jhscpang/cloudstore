'use strict';

var cloudDiskapp = {};

//var App = angular.module('cloudDiskapp', ['cloudDiskapp.filters', 'cloudDiskapp.services', 'cloudDiskapp.directives']);
var App = angular.module('cloudDiskapp', ['cloudDiskapp.services']);
// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/files', {
        templateUrl: 'file_list.html',
        controller: FileController
    });
    $routeProvider.when('/recycle_bin', {
        templateUrl: 'recycle_bin_list.html',
        controller: RecycleController
    });
    $routeProvider.when('/image_list', {
        templateUrl: 'image_list.html',
        controller: ImageController
    });
    $routeProvider.when('/music_list', {
        templateUrl: 'file_list.html',
        controller: MusicController
    });
    $routeProvider.when('/video_list', {
        templateUrl: 'file_list.html',
        controller: VideoController
    });
    $routeProvider.when('/document_list', {
        templateUrl: 'file_list.html',
        controller: DocumentController
    });
    $routeProvider.when('/other_list', {
        templateUrl: 'file_list.html',
        controller: OtherController
    });
    $routeProvider.otherwise({redirectTo: '/files'});
}]);
App.filter('changefile', function () {
                return function (input) {
                	 var output = '';
                	var j = 0;
                     while(input>1000){
                    	 input=input/1000;
                    	 j++;
                     }
                	if(j==0){
                		output=parseInt(input)+' B';
                	}
                	else if(j==1){
                		output=parseInt(input)+' KB';
                	}
                	else if(j==2){
                		output=parseInt(input)+' MB'
                	}
                     return output;
                 };
             });
