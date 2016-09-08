package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetHasRetentionPolicy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetHasRetentionPolicy currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetHasRetentionPolicy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetHasRetentionPolicyIterator thePolicySetHasRetentionPolicyIterator = (PolicySetHasRetentionPolicyIterator)findAncestorWithClass(this, PolicySetHasRetentionPolicyIterator.class);
			pageContext.getOut().print(thePolicySetHasRetentionPolicyIterator.getHasRetentionPolicy());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for hasRetentionPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for hasRetentionPolicy tag ");
		}
		return SKIP_BODY;
	}
}

