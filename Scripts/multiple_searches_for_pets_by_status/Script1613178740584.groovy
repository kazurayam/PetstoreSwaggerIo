import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonOutput

println "multiple_searches_for_pets_by_status"

def statusList = ["pending", "sold"]

for (status in statusList) {
	println "-------------------- ${status} pets --------------------"
	String doc = retrievePetsByStatus(status)
	println JsonOutput.prettyPrint(doc)
}

def retrievePetsByStatus(String status) {
	TestObject tObj = findTestObject("Object Repository/my/petstore_findByStatus_parameterized", ["status": status])
	if (tObj instanceof RequestObject) {
		RequestObject req = (RequestObject)tObj
		ResponseObject res = WS.sendRequest(req)
		return res.getResponseBodyContent()
	} else
		throw new IllegalArgumentException("not a RequestObject")
}


