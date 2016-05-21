'use strict';

/**
 * OtherController
 * @constructor
 */
var OtherController = function($scope, $http, $window) {
	$scope.isSave=true;
	$scope.isShow = false;
	$scope.isMenuShow = false;
	$scope.deleteFile;
    $scope.fetchFilesList = function() {
        $http.get('cloudDisk/type.do?type=other').success(function(FileList){
            $scope.Files = FileList;
        });
    };
    $scope.showChild = function(file){
    	
    	if(file.fileFormate=="Dir"){
    		
    		$http.get('cloudDisk/childfiles.do?id=' + file.id).success(function(FileList){
    			console.log("show child");
    			$scope.Files = FileList;
    		})
    	}
    }
    $scope.addNewFolder = function(foldername) {
        $http.post('cloudDisk/addDir.do?foldername=' + foldername).success(function() {
            $scope.fetchFilesList();
            $scope.isShow = !$scope.isShow;
        });
        $scope.foldername = '';
    };
    $scope.showNewFolder = function() {
    	$scope.isShow = !$scope.isShow;
    };
    $scope.showMenu = function() {
    	$scope.isMenuShow = !$scope.isMenuShow;
    };
    $scope.showEdit = function(file) {
    	//$scope.isSave = !$scope.isSave;
    	var id = "txt_name_" + file.id;
    	
//    	console.log(id);
    	var obj = $("#"+id);
    	
        obj.removeClass("inactive");
        obj.addClass("active");
        obj.removeAttr("readOnly");
        var saveid = "save_name_" +file.id;
        var save_button = $("#"+saveid);
//        console.log(save_button);
    	save_button.removeClass("hide");
    	var cancel_id = "cancel_name_"+ file.id;
    	var cancel_button = $("#" + cancel_id);
    	cancel_button.removeClass("hide");
    };
    $scope.showDelete = function(file){
    	var obj = $("#confirm");
    	obj.show();
    	$scope.deleteFile = file;
    }
    $scope.hideDeleteDialog=function(){
    	$("#confirm").hide();
    }
    $scope.editFile = function(file){
    	$http.post('cloudDisk/edit.do',file).success(function() {
            $scope.fetchFilesList();
        });
    }
    $scope.removeFile = function() {
    	$("#confirm").hide();
    	console.log($scope.deleteFile.id);
        $http.post('cloudDisk/delete.do', $scope.deleteFile).success(function() {
            $scope.fetchFilesList();
        });
    };
    $scope.download = function(file){
    	$http.post('download.do', file).success(function(data,status){
    		console.log(data);
    		$window.open(data);
    	});
    }
    $scope.onFileSelect = function($uploadfiles) {    //$files: an array of files selected, each file has name, size, and type.
        for (var i = 0; i < $files.length; i++) {      var file = $files[i];
          $scope.upload = $upload.upload({
            url: 'server/upload/url', //upload.php script, node.js route, or servlet url
            //method: 'POST' or 'PUT',
            //headers: {'header-key': 'header-value'},
            //withCredentials: true,
            data: {myObj: $scope.myModelObj},
            file: file, // or list of files ($files) for html5 only
            //fileName: 'doc.jpg' or ['1.jpg', '2.jpg', ...] // to modify the name of the file(s)
            // customize file formData name ('Content-Disposition'), server side file variable name. 
            //fileFormDataName: myFile, //or a list of names for multiple files (html5). Default is 'file' 
            // customize how data is added to formData. See #40#issuecomment-28612000 for sample code
            //formDataAppender: function(formData, key, val){}
          }).progress(function(evt) {        console.log('percent: ' + parseInt(100.0 * evt.loaded / evt.total));
          }).success(function(data, status, headers, config) {        // file is uploaded successfully
            console.log(data);
          });      //.error(...)
          //.then(success, error, progress); 
          // access or attach event listeners to the underlying XMLHttpRequest.
          //.xhr(function(xhr){xhr.upload.addEventListener(...)})
        }    /* alternative way of uploading, send the file binary with the file's content-type.       Could be used to upload files to CouchDB, imgur, etc... html5 FileReader is needed.        It could also be used to monitor the progress of a normal http post/put request with large data*/
        // $scope.upload = $upload.http({...})  see 88#issuecomment-31366487 for sample code.
      };

    $scope.fetchFilesList();
};
