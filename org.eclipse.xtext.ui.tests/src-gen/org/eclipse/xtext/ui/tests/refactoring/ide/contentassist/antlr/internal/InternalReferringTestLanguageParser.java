package org.eclipse.xtext.ui.tests.refactoring.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.ui.tests.refactoring.services.ReferringTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReferringTestLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ref'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalReferringTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReferringTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReferringTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReferringTestLanguage.g"; }


    	private ReferringTestLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(ReferringTestLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMain"
    // InternalReferringTestLanguage.g:53:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalReferringTestLanguage.g:54:1: ( ruleMain EOF )
            // InternalReferringTestLanguage.g:55:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalReferringTestLanguage.g:62:1: ruleMain : ( ( rule__Main__ReferencedAssignment )* ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:66:2: ( ( ( rule__Main__ReferencedAssignment )* ) )
            // InternalReferringTestLanguage.g:67:2: ( ( rule__Main__ReferencedAssignment )* )
            {
            // InternalReferringTestLanguage.g:67:2: ( ( rule__Main__ReferencedAssignment )* )
            // InternalReferringTestLanguage.g:68:3: ( rule__Main__ReferencedAssignment )*
            {
             before(grammarAccess.getMainAccess().getReferencedAssignment()); 
            // InternalReferringTestLanguage.g:69:3: ( rule__Main__ReferencedAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReferringTestLanguage.g:69:4: rule__Main__ReferencedAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    rule__Main__ReferencedAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getReferencedAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleReference"
    // InternalReferringTestLanguage.g:78:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalReferringTestLanguage.g:79:1: ( ruleReference EOF )
            // InternalReferringTestLanguage.g:80:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalReferringTestLanguage.g:87:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:91:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalReferringTestLanguage.g:92:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalReferringTestLanguage.g:92:2: ( ( rule__Reference__Group__0 ) )
            // InternalReferringTestLanguage.g:93:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalReferringTestLanguage.g:94:3: ( rule__Reference__Group__0 )
            // InternalReferringTestLanguage.g:94:4: rule__Reference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleFQN"
    // InternalReferringTestLanguage.g:103:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalReferringTestLanguage.g:104:1: ( ruleFQN EOF )
            // InternalReferringTestLanguage.g:105:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalReferringTestLanguage.g:112:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:116:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalReferringTestLanguage.g:117:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalReferringTestLanguage.g:117:2: ( ( rule__FQN__Group__0 ) )
            // InternalReferringTestLanguage.g:118:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalReferringTestLanguage.g:119:3: ( rule__FQN__Group__0 )
            // InternalReferringTestLanguage.g:119:4: rule__FQN__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalReferringTestLanguage.g:127:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:131:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalReferringTestLanguage.g:132:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalReferringTestLanguage.g:139:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:143:1: ( ( 'ref' ) )
            // InternalReferringTestLanguage.g:144:1: ( 'ref' )
            {
            // InternalReferringTestLanguage.g:144:1: ( 'ref' )
            // InternalReferringTestLanguage.g:145:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalReferringTestLanguage.g:154:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:158:1: ( rule__Reference__Group__1__Impl )
            // InternalReferringTestLanguage.g:159:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalReferringTestLanguage.g:165:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ReferencedAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:169:1: ( ( ( rule__Reference__ReferencedAssignment_1 ) ) )
            // InternalReferringTestLanguage.g:170:1: ( ( rule__Reference__ReferencedAssignment_1 ) )
            {
            // InternalReferringTestLanguage.g:170:1: ( ( rule__Reference__ReferencedAssignment_1 ) )
            // InternalReferringTestLanguage.g:171:2: ( rule__Reference__ReferencedAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getReferencedAssignment_1()); 
            // InternalReferringTestLanguage.g:172:2: ( rule__Reference__ReferencedAssignment_1 )
            // InternalReferringTestLanguage.g:172:3: rule__Reference__ReferencedAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Reference__ReferencedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferencedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalReferringTestLanguage.g:181:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:185:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalReferringTestLanguage.g:186:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalReferringTestLanguage.g:193:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:197:1: ( ( RULE_ID ) )
            // InternalReferringTestLanguage.g:198:1: ( RULE_ID )
            {
            // InternalReferringTestLanguage.g:198:1: ( RULE_ID )
            // InternalReferringTestLanguage.g:199:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalReferringTestLanguage.g:208:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:212:1: ( rule__FQN__Group__1__Impl )
            // InternalReferringTestLanguage.g:213:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalReferringTestLanguage.g:219:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:223:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalReferringTestLanguage.g:224:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalReferringTestLanguage.g:224:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalReferringTestLanguage.g:225:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalReferringTestLanguage.g:226:2: ( rule__FQN__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReferringTestLanguage.g:226:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalReferringTestLanguage.g:235:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:239:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalReferringTestLanguage.g:240:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalReferringTestLanguage.g:247:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:251:1: ( ( '.' ) )
            // InternalReferringTestLanguage.g:252:1: ( '.' )
            {
            // InternalReferringTestLanguage.g:252:1: ( '.' )
            // InternalReferringTestLanguage.g:253:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,12,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalReferringTestLanguage.g:262:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:266:1: ( rule__FQN__Group_1__1__Impl )
            // InternalReferringTestLanguage.g:267:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalReferringTestLanguage.g:273:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:277:1: ( ( RULE_ID ) )
            // InternalReferringTestLanguage.g:278:1: ( RULE_ID )
            {
            // InternalReferringTestLanguage.g:278:1: ( RULE_ID )
            // InternalReferringTestLanguage.g:279:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Main__ReferencedAssignment"
    // InternalReferringTestLanguage.g:289:1: rule__Main__ReferencedAssignment : ( ruleReference ) ;
    public final void rule__Main__ReferencedAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:293:1: ( ( ruleReference ) )
            // InternalReferringTestLanguage.g:294:2: ( ruleReference )
            {
            // InternalReferringTestLanguage.g:294:2: ( ruleReference )
            // InternalReferringTestLanguage.g:295:3: ruleReference
            {
             before(grammarAccess.getMainAccess().getReferencedReferenceParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getMainAccess().getReferencedReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__ReferencedAssignment"


    // $ANTLR start "rule__Reference__ReferencedAssignment_1"
    // InternalReferringTestLanguage.g:304:1: rule__Reference__ReferencedAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Reference__ReferencedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReferringTestLanguage.g:308:1: ( ( ( ruleFQN ) ) )
            // InternalReferringTestLanguage.g:309:2: ( ( ruleFQN ) )
            {
            // InternalReferringTestLanguage.g:309:2: ( ( ruleFQN ) )
            // InternalReferringTestLanguage.g:310:3: ( ruleFQN )
            {
             before(grammarAccess.getReferenceAccess().getReferencedEObjectCrossReference_1_0()); 
            // InternalReferringTestLanguage.g:311:3: ( ruleFQN )
            // InternalReferringTestLanguage.g:312:4: ruleFQN
            {
             before(grammarAccess.getReferenceAccess().getReferencedEObjectFQNParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getReferencedEObjectFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferencedEObjectCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ReferencedAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    }


}