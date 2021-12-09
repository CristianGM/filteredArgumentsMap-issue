# filteredArgumentsMap-issue

Running 3 times compileKotlin with configuration-cache enabled

First time: ✓
 - configuration not cached ✓
 - task not cached ✓

Second time:
 - configuration cached ✓
 - task up-to-date FAIL
 > Task ':compileKotlin' is not up-to-date because:
  Value of input property 'filteredArgumentsMap' has changed for task ':compileKotlin'
The input changes require a full rebuild for incremental task ':compileKotlin'.
 
Third time:
 - configuration cached ✓
 - task up-to-date ✓
