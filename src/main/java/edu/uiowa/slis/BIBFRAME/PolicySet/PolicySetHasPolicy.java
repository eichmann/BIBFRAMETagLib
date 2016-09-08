package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetHasPolicy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetHasPolicy currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetHasPolicy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetHasPolicyIterator thePolicySetHasPolicyIterator = (PolicySetHasPolicyIterator)findAncestorWithClass(this, PolicySetHasPolicyIterator.class);
			pageContext.getOut().print(thePolicySetHasPolicyIterator.getHasPolicy());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for hasPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for hasPolicy tag ");
		}
		return SKIP_BODY;
	}
}

