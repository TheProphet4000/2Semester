# Test mod Formel Use Case UC - 04 Beregn Indtjeningsbidrag

## Test mod Usecase04

### HØK1:
2.a HØK Studerende angiver negativt tal i kontante omkostninger.

### Forventet:
Systemet oplyser at kontante omkostninger ikke må være negativ og beder om et nyt tal.

### Actual:
(Pass) Negative tal kan ikke benyttes. Note: Ikke samme pop-up besked som negative tal i “Omkostninger”. 

<br />

### HØK2:
2.b HØK Studerende angiver non-numeriske tegn i kontante omkostninger.

### Forventet:
Systemet oplyser at kontante omkostninger skal beskrives med tal og beder om et nyt input.

### Actual:
(Fail) Tager ikke imod non-numerisk input = Ingen fejlbeskeder.

<br />

### Input for Markedsføringsbidrag & Indtjeningsbidrag:
Markedsføringsbidrag = 100
<br />
Indtjeningsbidrag    = 0
### Forventet:
Output: Intjeningsbidrag = 100 
### Acutal:
(Pass) Output => Indtjeningsbidrag = 100 
<br />
Note: Indtjeningsbidrag bliver det samme, som Markedsføringsbidrag.


