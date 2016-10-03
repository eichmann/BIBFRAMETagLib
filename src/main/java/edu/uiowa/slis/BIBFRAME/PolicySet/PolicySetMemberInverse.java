package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetMemberInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetMemberInverseIterator thePolicySetMemberInverseIterator = (PolicySetMemberInverseIterator)findAncestorWithClass(this, PolicySetMemberInverseIterator.class);
			pageContext.getOut().print(thePolicySetMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for member tag ");
		}
		return SKIP_BODY;
	}
}

