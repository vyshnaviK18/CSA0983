<!DOCTYPE html>
<!-- saved from url=(0044)http://172.18.34.244/j_program/onlineide.php -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
	<title>Java Programming - IDE</title>
	<link rel="stylesheet" type="text/css" href="./sort insertion_files/onlineide.css">
	<link rel="stylesheet" type="text/css" href="./sort insertion_files/codemirror.min.css">
	<link rel="stylesheet" type="text/css" href="./sort insertion_files/dracula.min.css">
	<link rel="stylesheet" type="text/css" href="./sort insertion_files/simplescrollbars.min.css">
     
	<script src="./sort insertion_files/annotatescrollbar.min.js.download"></script>
	<script src="./sort insertion_files/clike.min.js.download"></script>
	<script src="./sort insertion_files/closebrackets.min.js.download"></script>
	<script src="./sort insertion_files/codemirror.min.js.download"></script>
	<script src="./sort insertion_files/javascript.min.js.download"></script>
	<script src="./sort insertion_files/jquery-3.6.0.min.js.download"></script>
	<script src="./sort insertion_files/matchbrackets.min.js.download"></script>
	<script src="./sort insertion_files/match-highlighter.min.js.download"></script>
	<script src="./sort insertion_files/python.min.js.download"></script>
	<script src="./sort insertion_files/simplescrollbars.min.js.download"></script>
	<script src="./sort insertion_files/sweetalert.min.js.download"></script>
	
	<!-- for code editor JavaScript files -->
	<script src="./sort insertion_files/clike.min.js(1).download"></script>
	<script src="./sort insertion_files/codemirror.min.js(1).download"></script>
	<link rel="stylesheet" href="./sort insertion_files/codemirror.min(1).css">
	<link rel="stylesheet" href="./sort insertion_files/dracula.min(1).css">
	<script src="./sort insertion_files/javascript.min.js(1).download"></script>
	<script src="./sort insertion_files/closebrackets.min.js(1).download"></script>
	<script src="./sort insertion_files/matchbrackets.min.js(1).download"></script>
	<script src="./sort insertion_files/annotatescrollbar.min.js(1).download"></script>
	<link rel="stylesheet" href="./sort insertion_files/simplescrollbars.min(1).css">
	<script src="./sort insertion_files/simplescrollbars.min.js(1).download"></script>
	<script src="./sort insertion_files/match-highlighter.min.js(1).download"></script>
	<!-- Include mode-specific JavaScript files -->
	<script src="./sort insertion_files/clike.min.js(1).download"></script>
	<script src="./sort insertion_files/python.min.js(1).download"></script>
	<!-- for code editor JavaScript files  Ends-->
	
	<!--used for jquery function -->
	<script src="./sort insertion_files/jquery-3.6.0.min.js(1).download"></script>
	
	<style>
	.col-2 button 
		{
			font-size: 14px;
		}
		.bodytag
		{
			-webkit-user-select: none;
			-webkit-touch-callout: none;
			-moz-user-select: none;
			-ms-user-select: none;
			user-select: none;
		}
		
	</style>
	<script type="text/javascript">
		$(document).ready(function() {
		 $('.bodytag').bind('copy paste cut contextmenu dragstart drop',function(e) { 
		 e.preventDefault(); //disable cut,copy,paste
		 //alert('cut,copy & paste options are disabled !!');
		 });
		});
		
		$(document).on('dragover drop', function(e){
			e.preventDefault();
			editor.setValue(""); // Set the editor's content to an empty string
			 swal({
				title: "Warning...\n",
				text: "Trying to Drag Drop not allowed!",
				icon: "error",
				buttons: {
					confirm: {
						text: "OK",
						value: true,
						visible: true,
						className: "btn btn-primary",
						closeModal: true,
					}
				},
			});
			//alert('Drag and drop is not allowed on this page.');
		});
		var editorElement = document.getElementById("editor");

		editorElement.addEventListener("cut", function(event) {
			event.preventDefault();
		});

		editorElement.addEventListener("copy", function(event) {
			event.preventDefault();
		});

		editorElement.addEventListener("paste", function(event) {
			event.preventDefault();
		});
	</script>
</head>

<body class="bodytag">
	<div class="header">
			<img src="./sort insertion_files/sselogonew.png" style="height:50px;width:200px" alt="Logo">
			<h2>Java Programming</h2>
			<div class="user-profile">
				<img src="./sort insertion_files/user.png" alt="User photo">
				<div class="user-details">
					<span class="username">VYSHNAVI.K</span>
					<span class="name">192125058</span>
				</div>
				<div class="dropdown">
					<button class="dropbtn">▼</button>
					<div class="dropdown-content">
						<a href="http://172.18.34.244/j_program/chome.php">Home</a>
						<a href="http://172.18.34.244/j_program/logout.php">Logout</a>
					</div>
				</div>
			</div>
	</div>
	<form action="javascript:void(0);" method="POST">
			<div class="second-row">
				<div class="col-1"> 
				    <div class="loading-msg" style="display: none;">Loading questions...</div>
					<script>
					$(document).ready(function() {
						// Display loading message
						$(".loading-msg").show();
						
						setTimeout(function(){
							// Trigger click event on first button inside col-1
							$(".col-2 button:first").trigger("click");
							
							// Hide loading message
							$(".loading-msg").hide();
						}, 500); // delay for 500 milliseconds
					});
					</script>
					<!-- Question content will be added here -->
					<p class="randomquestions" id="ttt" style="font-family:Arial; font-size:14px"><b>Questions</b><br>31. Write a Java program to implement insertion sort on an array of integers using loops and conditional statements.</p>
				</div>
				<div class="col-2" id="col-2" style="height:100%; overflow-y: auto;"> 
				     <script>
						$(document).ready(function() {
							$.ajax({
								url: 'topics/button.php',
								type: 'POST',
								dataType: 'json',
								success: function(data) {
									if(data.length==0){window.location.href = "chome.php";}
									for (var i = 0; i < data.length; i++) {
										//var text = data[i];
										var button_data = data[i];
										var button_id = button_data.qids;
										var button_text = button_data.qtitles;
										$('#col-2').append('<button id="' + button_id + '">' + button_text + '</button>');
									}
									// Attach a click event listener to the button
									  $('#col-2 button').click(function() {
										handleButtonClick($(this).attr('id'));
									  });
								},
								error: function(xhr, status, error) {
									console.log(xhr.responseText);
								}
							});
						});
						
						$(document).ready(function() {
						   setTimeout(function(){
							 // Trigger click event on first button inside col-1
							 $(".col-2 button:first").trigger("click");							 
						   }, 500); // delay for 1 second (1000 milliseconds)
						});			
					</script>

				<button id="31" style="background-color: rgb(62, 142, 65);">Sort-I</button><button id="30">Sort-B</button><button id="28">Min</button><button id="29">2nd Min</button><button id="26">Max Array</button><button id="27">2nd Max</button><button id="24">RT-num.Pattern</button><button id="25">Perfect</button><button id="22">Palindrome</button><button id="23">Armstrong</button><button id="21">Shpere</button><button id="19">Power</button><button id="20">Area Circle</button><button id="18">Product</button><button id="16">B to D</button><button id="17">Sum</button><button id="15">D to B</button><button id="14">LCM</button><button id="12">Factorial</button><button id="13">LT-Pattern</button><button id="11">Table</button><button id="9">Prime</button><button id="10">Sort</button><button id="8">GCD</button><button id="7">Search</button><button id="4">Fibonacci</button><button id="5"> Factorial</button><button id="6">RT-Pattern</button><button id="3">Leap</button><button id="1">Arithmetic</button><button id="2">MAX</button></div>
			</div>
			<div class="third-row">
			  <div class="buttons-container">
				<button class="button-run" id="button-run" onclick="runprogram()">Run</button>
				<button class="button-save" id="button-save" onclick="saveprogram()">Save</button>
				<span class="message" id="message" style="color:red; font-size:14px; padding:0px font-weight: bold;"></span>
			  </div>
			</div>
			<div class="fourth-row">
				<div class="left">
					 <textarea id="editor" style="display: none;"></textarea><div class="CodeMirror cm-s-dracula CodeMirror-simplescroll" style="height: 100%;"><div style="overflow: hidden; position: relative; width: 3px; height: 0px; top: 4px; left: 33px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" tabindex="0" style="position: absolute; bottom: -1em; padding: 0px; width: 1000px; height: 1em; outline: none;"></textarea></div><div class="CodeMirror-simplescroll-horizontal" cm-not-content="true" style="display: none;"><div></div></div><div class="CodeMirror-simplescroll-vertical" cm-not-content="true" style="display: none;"><div></div></div><div class="CodeMirror-scrollbar-filler" cm-not-content="true"></div><div class="CodeMirror-gutter-filler" cm-not-content="true"></div><div class="CodeMirror-scroll" tabindex="-1"><div class="CodeMirror-sizer" style="margin-left: 29px; margin-bottom: -17px; border-right-width: 33px; min-height: 558px; min-width: 412.875px; padding-right: 0px; padding-bottom: 0px;"><div style="position: relative; top: 0px;"><div class="CodeMirror-lines" role="presentation"><div role="presentation" style="position: relative; outline: none;"><div class="CodeMirror-measure"><pre class="CodeMirror-line-like">x</pre><div class="CodeMirror-linenumber CodeMirror-gutter-elt"><div>1</div></div><div class="CodeMirror-linenumber CodeMirror-gutter-elt"><div>25</div></div></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"></div><div class="CodeMirror-cursors" style="visibility: hidden;"><div class="CodeMirror-cursor" style="left: 4px; top: 0px; height: 22px;">&nbsp;</div></div><div class="CodeMirror-code" role="presentation" style=""><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-keyword">import</span> <span class="cm-variable">java</span>.<span class="cm-variable">util</span>.<span class="cm-operator">*</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">2</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">3</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-keyword">class</span> <span class="cm-def">R192125058</span>{</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">4</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">  <span class="cm-keyword">public</span> <span class="cm-keyword">static</span> <span class="cm-type">void</span> <span class="cm-variable">main</span>(<span class="cm-type">String</span> <span class="cm-variable">args</span>[]){</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">5</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-type">int</span> <span class="cm-variable">arr</span>[]<span class="cm-operator">=</span><span class="cm-keyword">new</span> <span class="cm-type">int</span>[<span class="cm-number">100</span>];</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">6</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-type">int</span> <span class="cm-variable">n</span>,<span class="cm-variable">i</span>,<span class="cm-variable">j</span>,<span class="cm-variable">key</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">7</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-variable">Scanner</span> <span class="cm-variable">o</span><span class="cm-operator">=</span> <span class="cm-keyword">new</span> <span class="cm-variable">Scanner</span>(<span class="cm-variable">System</span>.<span class="cm-variable">in</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">8</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-variable">n</span><span class="cm-operator">=</span><span class="cm-variable">o</span>.<span class="cm-variable">nextInt</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">9</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-keyword">for</span>(<span class="cm-variable">i</span><span class="cm-operator">=</span><span class="cm-number">0</span>;<span class="cm-variable">i</span><span class="cm-operator">&lt;</span><span class="cm-variable">n</span>;<span class="cm-variable">i</span><span class="cm-operator">++</span>){</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">10</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-variable">arr</span>[<span class="cm-variable">i</span>]<span class="cm-operator">=</span><span class="cm-variable">o</span>.<span class="cm-variable">nextInt</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">11</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">12</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-keyword">for</span>(<span class="cm-variable">i</span><span class="cm-operator">=</span><span class="cm-number">0</span>;<span class="cm-variable">i</span><span class="cm-operator">&lt;</span><span class="cm-variable">n</span>;<span class="cm-variable">i</span><span class="cm-operator">++</span>){</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">13</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-variable">key</span><span class="cm-operator">=</span><span class="cm-variable">arr</span>[<span class="cm-variable">i</span>];</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">14</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-variable">j</span><span class="cm-operator">=</span><span class="cm-variable">i</span><span class="cm-operator">-</span><span class="cm-number">1</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">15</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-keyword">while</span>(<span class="cm-variable">j</span><span class="cm-operator">&gt;=</span><span class="cm-number">0</span> <span class="cm-operator">&amp;&amp;</span> <span class="cm-variable">key</span><span class="cm-operator">&lt;</span><span class="cm-variable">arr</span>[<span class="cm-variable">j</span>]){</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">16</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">        <span class="cm-variable">arr</span>[<span class="cm-variable">j</span><span class="cm-operator">+</span><span class="cm-number">1</span>]<span class="cm-operator">=</span><span class="cm-variable">arr</span>[<span class="cm-variable">j</span>];</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">17</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">        <span class="cm-operator">--</span><span class="cm-variable">j</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">18</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">19</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-variable">arr</span>[<span class="cm-variable">j</span><span class="cm-operator">+</span><span class="cm-number">1</span>]<span class="cm-operator">=</span><span class="cm-variable">key</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">20</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">21</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    <span class="cm-keyword">for</span>(<span class="cm-variable">i</span><span class="cm-operator">=</span><span class="cm-number">0</span>;<span class="cm-variable">i</span><span class="cm-operator">&lt;</span><span class="cm-variable">n</span>;<span class="cm-variable">i</span><span class="cm-operator">++</span>){</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">22</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">      <span class="cm-variable">System</span>.<span class="cm-variable">out</span>.<span class="cm-variable">println</span>(<span class="cm-variable">arr</span>[<span class="cm-variable">i</span>]<span class="cm-operator">+</span><span class="cm-string">"\t"</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">23</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">    }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">24</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" aria-hidden="true" style="left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">25</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">}</span></pre></div></div></div></div></div></div><div style="position: absolute; height: 33px; width: 1px; border-bottom: 0px solid transparent; top: 558px;"></div><div class="CodeMirror-gutters" style="height: 591px; left: 0px;"><div class="CodeMirror-gutter CodeMirror-linenumbers" style="width: 29px;"></div></div></div></div>
							<script>
								var editor = CodeMirror.fromTextArea(document.getElementById("editor"), {
									lineNumbers: true,
									// mode: "text/x-c++src", // change the mode to C language,
									// mode: "text/x-csrc", // for C mode
									mode: "text/x-java", // for Java mode
									// mode: "text/x-python", // for Python mode
									theme: "dracula",
									autoCloseBrackets: true,
									matchBrackets: true,
									scrollbarStyle: "simple",
									highlightSelectionMatches: true,
									extraKeys: {
										"Ctrl-X": false, // disable cut
										"Ctrl-C": false, // disable copy
										"Ctrl-V": false, // disable paste
										"Cmd-X": false, // disable cut (for Mac)
										"Cmd-C": false, // disable copy (for Mac)
										"Cmd-V": false // disable paste (for Mac)
									}
								});
								editor.setSize(null, "100%"); // add this line to set the height to 100%
								editor.on("paste", function(cm, e) {
									e.preventDefault();
								});
								editor.on("cut", function(cm, e) {
									e.preventDefault();
								});
								editor.on("copy", function(cm, e) {
									e.preventDefault();
								});
								
							</script>
				</div>
				<div class="right">
					<div class="top" id="input_data">
						<textarea class="input_area" id="input_area" placeholder="Your INPUT go&#39;s here! Give only values. do not give like a=10"></textarea>
					</div>
					<div class="bottom" id="output_data">
						<textarea class="output_area" id="output_area" disabled="" placeholder="Your OUTPUT go&#39;s here!" style="border-color: green;">3	
4	
12	


</textarea>
					</div>
				</div>
			</div>
	</form>
	<div class="footerdiv">
	    <footer>
			<p>© 2023 My Website. All rights reserved.</p>
		</footer>
	</div>
	
	<script>
		// Function to handle button click event
		function handleButtonClick(buttonId) 
		{
			document.getElementById('message').innerHTML = '';
			questionID=buttonId;
			$.ajax({
				url:'displayquestions.php',
				type: "POST",
				dataType:'json', // add json datatype to get json
				data: ({questionIDs: questionID}),
				success: function(data)
				{
					var printquestion=data[0]+". "+data[1];
					var str=data[1];
					$('.randomquestions').html("<b>Questions</b></br>"+printquestion);
					//var t="<b>Test Cases</b>"+"<br>"+data[2];
					//$('.testcases1').html(t);
				}
			});
			checkanswersubmitted(questionID);
			changebtnbgcolor();
		}
		
		//Check answer submitted or not
		function checkanswersubmitted(buttonId)
		{
			
			const username = "192125058";
			questionID=buttonId;
			$.ajax({
				url:'checkforanswersubmitted.php',
				type: "POST",
				dataType:'json', // add json datatype to get json
				data: ({questionIDs:questionID,username:username}),
				success: function(data)
				{
					var questionsavedornot=data[0];
					if(questionsavedornot=="Yes")
					{ 
						editor.setValue(data[1]);
						$('.input_area').val(data[3]);
						$('.output_area').html(data[2]);		
					}
					else
					{
						editor.setValue("");
						$('.input_area').val("");
						$('.output_area').html("");
					}
				}
			});
			
		}
		function changebtnbgcolor()
		{
			const username = "192125058";
			$.ajax({
				url:'changebtnbackground.php',
				type: "POST",
				dataType:'json', // add json datatype to get json
				data: ({username:username}),
				success: function(data)
				{
					var arrayLength = data.length;
					//alert(arrayLength);
					for(var i=0;i<arrayLength;i++)
					{
						var myButton = document.getElementById(data[i]);
						if (myButton) 
						{
							myButton.style.backgroundColor = "#3e8e41";
						}
					}
				}
			});
		}
		 		
		// Save question id, userid, code, input and output
		function saveprogram() 
		{			
				const buttonSave = document.getElementById('button-save');
				buttonSave.disabled = true;
				
			 	const username = "192125058";
				const t = "control";
				//alert(t);
				$('.message').html("Saving..."+questionID);
			 	const input_data1 = document.getElementById('input_area');
				const output_data1 = document.getElementById("output_area");
				var code = editor.getValue();
				var input_data=input_data1.value;
				var output_data=output_data1.value;
				$.ajax({
					url:'saveprogram.php',
					type: "POST",
					dataType:'json', // add json datatype to get json
					data: ({questionIDs:questionID,username:username,code:code,input_data:input_data,output_data:output_data,t:t}),
					success: function(data)
					{
						var respmessage=data[0];               
						$('.message').html(respmessage);
						changebtnbgcolor();
						const messageDuration = Math.max(5000, respmessage.length * 500);
						setTimeout(hideMessage, messageDuration);
						buttonSave.disabled = false;
						
					}
				}); 
		}
		function hideMessage() 
		{
			$('.message').html("");
		}
	</script>    
	<script>
		function runprogram() {
			    saveprogram();
				const username = "192125058";
				//$('.message').html("Saving..."+questionID);
			 	const input_data1 = document.getElementById('input_area');
				
				const buttonRun = document.getElementById('button-run');
				const buttonSave = document.getElementById('button-save');
				buttonRun.disabled = true;
				buttonSave.disabled = true;
				
				var code = editor.getValue();
				var input_data=input_data1.value;
				// show loading message
				$('.output_area').html("Loading...");
				$.ajax({
					url:'ExecutionFolder/runprogram.php',
					cache: false,
					type: "POST",
					dataType:'html', // add json datatype to get json
					data: ({questionIDs: questionID,username:username,code:code,input_data:input_data}),
					success: function(data)
					{
						var respmessage=data;               
						$('.output_area').html(respmessage);
						var outputArea = document.getElementById("output_area");
						if (respmessage.includes("ExecutionFolder/") || respmessage.includes("Execution time limit exceeded") ) 
						{
						  outputArea.style.borderColor = "Red";
						  buttonRun.disabled = false;
						  buttonSave.disabled = false;
						} 
						else 
						{
						  outputArea.style.borderColor = "Green";
						  buttonRun.disabled = false;
						  buttonSave.disabled = false;
						}
					}
				}); 
		  
		}
	</script>


</body></html>