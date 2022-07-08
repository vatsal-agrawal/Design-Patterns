marketdata
getlatesttradeprice
symbol, ltp, quantity

stockmatketdatahandler
handlemarketdata

percentchange display
latesttrandepricedisplay
process marketdata


Let’s see what are the limitations of the above code:-

It violates the Open/Closed principle.
We haven’t declared an interface or a contract for communicating the state changes.
Currently, there is a hard dependency on the method process market data()

The code is not extensible & it’s difficult to factor in new requirements.
 What if there is a new requirement to display the Average price or Volume.
 Similar to PercentChangeDisplay and LatestTradePriceDisplay, we would add the corresponding classes.
 Further, we would have to modify the existing class to delegate the processing of market data to the new classes

There is a tight coupling between StockMarketDataHandler and the two concrete classes.
Addition of new features would mean adding more classes in the constructor parameter
Removal of a feature would also result in modification of the class StockMarketDataHandler.
For eg:- To stop the display of PercentChange, we will have to remove the class PercentChangeDisplay