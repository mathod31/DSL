package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'initstate'", "'finalstate'", "'state'", "','", "'transition'", "'->'", "': trigger:'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initstate' ( (lv_state_4_0= ruleInitstate ) ) otherlv_5= 'finalstate' ( (lv_state_6_0= ruleFinalstate ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_state_10_0 = null;

        EObject lv_transition_12_0 = null;

        EObject lv_transition_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initstate' ( (lv_state_4_0= ruleInitstate ) ) otherlv_5= 'finalstate' ( (lv_state_6_0= ruleFinalstate ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initstate' ( (lv_state_4_0= ruleInitstate ) ) otherlv_5= 'finalstate' ( (lv_state_6_0= ruleFinalstate ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initstate' ( (lv_state_4_0= ruleInitstate ) ) otherlv_5= 'finalstate' ( (lv_state_6_0= ruleFinalstate ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )* )
            // InternalMyDsl.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initstate' ( (lv_state_4_0= ruleInitstate ) ) otherlv_5= 'finalstate' ( (lv_state_6_0= ruleFinalstate ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getInitstateKeyword_3());
            		
            // InternalMyDsl.g:113:3: ( (lv_state_4_0= ruleInitstate ) )
            // InternalMyDsl.g:114:4: (lv_state_4_0= ruleInitstate )
            {
            // InternalMyDsl.g:114:4: (lv_state_4_0= ruleInitstate )
            // InternalMyDsl.g:115:5: lv_state_4_0= ruleInitstate
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateInitstateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_state_4_0=ruleInitstate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_4_0,
            						"org.xtext.example.mydsl.MyDsl.Initstate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getFinalstateKeyword_5());
            		
            // InternalMyDsl.g:136:3: ( (lv_state_6_0= ruleFinalstate ) )
            // InternalMyDsl.g:137:4: (lv_state_6_0= ruleFinalstate )
            {
            // InternalMyDsl.g:137:4: (lv_state_6_0= ruleFinalstate )
            // InternalMyDsl.g:138:5: lv_state_6_0= ruleFinalstate
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalstateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_6_0=ruleFinalstate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_6_0,
            						"org.xtext.example.mydsl.MyDsl.Finalstate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:155:3: ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }
                else if ( (LA3_0==16) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:156:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    {
            	    // InternalMyDsl.g:156:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:157:5: otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getStateKeyword_7_0_0());
            	    				
            	    // InternalMyDsl.g:161:5: ( (lv_state_8_0= ruleState ) )
            	    // InternalMyDsl.g:162:6: (lv_state_8_0= ruleState )
            	    {
            	    // InternalMyDsl.g:162:6: (lv_state_8_0= ruleState )
            	    // InternalMyDsl.g:163:7: lv_state_8_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_state_8_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_8_0,
            	    								"org.xtext.example.mydsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:180:5: (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:181:6: otherlv_9= ',' ( (lv_state_10_0= ruleState ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_7_0_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:185:6: ( (lv_state_10_0= ruleState ) )
            	    	    // InternalMyDsl.g:186:7: (lv_state_10_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:186:7: (lv_state_10_0= ruleState )
            	    	    // InternalMyDsl.g:187:8: lv_state_10_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_state_10_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_10_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:207:4: (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )
            	    {
            	    // InternalMyDsl.g:207:4: (otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )* )
            	    // InternalMyDsl.g:208:5: otherlv_11= 'transition' ( (lv_transition_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getFSMAccess().getTransitionKeyword_7_1_0());
            	    				
            	    // InternalMyDsl.g:212:5: ( (lv_transition_12_0= ruleTransition ) )
            	    // InternalMyDsl.g:213:6: (lv_transition_12_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:213:6: (lv_transition_12_0= ruleTransition )
            	    // InternalMyDsl.g:214:7: lv_transition_12_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_7_1_1_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_transition_12_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"transition",
            	    								lv_transition_12_0,
            	    								"org.xtext.example.mydsl.MyDsl.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:231:5: (otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==15) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:232:6: otherlv_13= ',' ( (lv_transition_14_0= ruleTransition ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_13, grammarAccess.getFSMAccess().getCommaKeyword_7_1_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:236:6: ( (lv_transition_14_0= ruleTransition ) )
            	    	    // InternalMyDsl.g:237:7: (lv_transition_14_0= ruleTransition )
            	    	    {
            	    	    // InternalMyDsl.g:237:7: (lv_transition_14_0= ruleTransition )
            	    	    // InternalMyDsl.g:238:8: lv_transition_14_0= ruleTransition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_7_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_transition_14_0=ruleTransition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"transition",
            	    	    									lv_transition_14_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.Transition");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:262:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:262:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:263:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:269:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:275:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:276:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:276:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:277:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:285:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:296:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:296:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:297:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:303:1: ruleTransition returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= ': trigger:' ( (lv_trigger_6_0= ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_trigger_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:309:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= ': trigger:' ( (lv_trigger_6_0= ruleEString ) ) ) )
            // InternalMyDsl.g:310:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= ': trigger:' ( (lv_trigger_6_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:310:2: ( () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= ': trigger:' ( (lv_trigger_6_0= ruleEString ) ) )
            // InternalMyDsl.g:311:3: () ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) otherlv_5= ': trigger:' ( (lv_trigger_6_0= ruleEString ) )
            {
            // InternalMyDsl.g:311:3: ()
            // InternalMyDsl.g:312:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:318:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:319:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:319:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:320:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:337:3: ( ( ruleEString ) )
            // InternalMyDsl.g:338:4: ( ruleEString )
            {
            // InternalMyDsl.g:338:4: ( ruleEString )
            // InternalMyDsl.g:339:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getStateFromStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalMyDsl.g:357:3: ( ( ruleEString ) )
            // InternalMyDsl.g:358:4: ( ruleEString )
            {
            // InternalMyDsl.g:358:4: ( ruleEString )
            // InternalMyDsl.g:359:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getStateToStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getTriggerKeyword_5());
            		
            // InternalMyDsl.g:377:3: ( (lv_trigger_6_0= ruleEString ) )
            // InternalMyDsl.g:378:4: (lv_trigger_6_0= ruleEString )
            {
            // InternalMyDsl.g:378:4: (lv_trigger_6_0= ruleEString )
            // InternalMyDsl.g:379:5: lv_trigger_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getTriggerEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_trigger_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:400:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:400:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:401:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:407:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:413:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:414:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:414:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:415:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:415:3: ()
            // InternalMyDsl.g:416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:422:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:423:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:423:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:424:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitstate"
    // InternalMyDsl.g:445:1: entryRuleInitstate returns [EObject current=null] : iv_ruleInitstate= ruleInitstate EOF ;
    public final EObject entryRuleInitstate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitstate = null;


        try {
            // InternalMyDsl.g:445:50: (iv_ruleInitstate= ruleInitstate EOF )
            // InternalMyDsl.g:446:2: iv_ruleInitstate= ruleInitstate EOF
            {
             newCompositeNode(grammarAccess.getInitstateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitstate=ruleInitstate();

            state._fsp--;

             current =iv_ruleInitstate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitstate"


    // $ANTLR start "ruleInitstate"
    // InternalMyDsl.g:452:1: ruleInitstate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleInitstate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:458:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:459:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:459:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:460:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:460:3: ()
            // InternalMyDsl.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitstateAccess().getInitstateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:467:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:468:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:468:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:469:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitstateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitstateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitstate"


    // $ANTLR start "entryRuleFinalstate"
    // InternalMyDsl.g:490:1: entryRuleFinalstate returns [EObject current=null] : iv_ruleFinalstate= ruleFinalstate EOF ;
    public final EObject entryRuleFinalstate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalstate = null;


        try {
            // InternalMyDsl.g:490:51: (iv_ruleFinalstate= ruleFinalstate EOF )
            // InternalMyDsl.g:491:2: iv_ruleFinalstate= ruleFinalstate EOF
            {
             newCompositeNode(grammarAccess.getFinalstateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalstate=ruleFinalstate();

            state._fsp--;

             current =iv_ruleFinalstate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalstate"


    // $ANTLR start "ruleFinalstate"
    // InternalMyDsl.g:497:1: ruleFinalstate returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFinalstate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:503:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:504:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:504:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:505:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:505:3: ()
            // InternalMyDsl.g:506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalstateAccess().getFinalstateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:512:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:513:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:513:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:514:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalstateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalstateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalstate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});

}