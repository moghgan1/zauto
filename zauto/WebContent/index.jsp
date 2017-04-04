<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ZAutomation Title</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="jquery-3.2.0.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="script.js"></script>

</head>
<body>

	<div class="hi" id="main-content-area-section">
		<div id="zaleft"></div>
		<div id="centline"></div>
		<div id="zaright">

			<div style="padding: 20px;">
				<form action="saveConfig" class="form-horizontal">


					<div class="form-group">
						<label class="control-label col-sm-2" for="aframwork">Automation tool:</label>
						<div class="col-sm-10">
							<select class="form-control" id="aframwork">
								<option value="selenium">Selenium</option>
								<option value="tosca">Tosca</option>
								<option value="robot">Robot Framework</option>
								<option value="cucumber">Cucumber</option>
							</select>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2" for="zbotagenmachine">Zbot:</label>
						<div class="col-sm-10">
							<select class="form-control" id="zbotagenmachine">
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="scriptpath">Script path:</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="scriptpath"
								placeholder="Enter the path of the script">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default"  id="zasubmit">Submit</button>
						</div>
						</div>
				</form>
			</div>

		</div>
	</div>
</body>
</html>
