var cityArr=[["Chennai","Hyderabad"],["Delhi"],["Pune","Mumbai"]];
function populateCity(){
	var zone = frm1.zone;
	var city = frm1.city;
	city.innerHTML="<option value='None'>Select</option>";
	var selectedIdx = frm1.zone.selectedIndex;
	for(i=0;i<cityArr[selectedIdx-1].length;i++){
		var myoption = new Option();
		myoption.text= cityArr[selectedIdx-1][i];
		myoption.value=cityArr[selectedIdx-1][i];
		city.add(myoption);
	}
}

function chkEmpty(){
	var mob = /^[7-9]{1}[0-9]{9}$/;
	var email=/[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$/;

	if (document.frm1.uname.value == "") {alert("Please fill the Name");}
	else if (document.frm1.pass.value == "") {alert("Please fill the Password");}
	else if (document.frm1.age.value == ""){alert("Please fill the Age");}
	else if (document.frm1.mailid.value == ""){alert("Please fill the Email");}
	else if (email.test(document.frmReg.txtEmail.value) == false) { alert("Please enter valid Email Id.");}
	else if (document.frmReg.txtPhone.value == "") {alert("Please fill the Mobile No.");}
	else if (mob.test(document.frmReg.txtPhone.value) == false) { alert("Please enter valid Contact no.");}
	else if (document.frmReg.persons.value == ""){alert("Please fill the Number of people attending");}
	else if (document.frm1.city.value=="none"){alert("Please select city")}
	/*else if (document.frmReg.state.value=="Select State"){alert("Please select state")}
	else if (document.frmReg.txtCardholderName.value == "") {alert("Please fill the Card holder name");}
	else if (document.frmReg.txtDebit.value == ""){alert("Please fill the Debit card Number");}
	else if (document.frmReg.txtCvv.value == "") {alert("Please fill the CVV");}
	else if (document.frmReg.txtMonth.value == ""){alert("Please fill expiration month");}
	else if (document.frmReg.txtYear.value == ""){alert("Please fill the expiration year");
}
*/

		else {
	alert(" completed Successfully.");
//	window.location="success.html";
		}
	}


function showDetails(){
	var uname = frm1.uname.value;
	var joinDate = frm1.jdate.value;

	var jDate = new Date(joinDate);
	var today = new Date();
	var exp = today.getYear() - jDate.getYear();
	//alert(uname + "Your Exp in company ="+exp+" years");
	var mywin = window.open();
	mywin.document.write(uname + "Your Experience in company ="+exp+" years")
}
