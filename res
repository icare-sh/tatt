p=72549841864194078899726837116892585496955575260843302046062234899404431414511
g=58759714624708089702199189818787533437405834872094654299502596364496752316901
A=71559523660568269188776671270040587101782920281998883402616283230525149718057

B=67719364237964147928448271440910028696447582883369228814004216914317779605772
AES-256-CBC no salt 
vi 123456789
openssl enc -aes-256-cbc -d -in Statue.jpg.out -out data.txt -K 30899383377856444262432941452181130060109265952665886885841266221802454368037 -iv 123456789
openssl enc -d -aes-256-cbc -in Statue.jpg.out -out data.txt -K 44506E64C6A3DE6416C6C3CE567A418371DBBEBDC917FC5DF61201770365BF25 -iv 123456789 -nosalt

