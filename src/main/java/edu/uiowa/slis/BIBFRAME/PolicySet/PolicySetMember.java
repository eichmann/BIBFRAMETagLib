package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetMember extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetMember currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetMember.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetMemberIterator thePolicySetMemberIterator = (PolicySetMemberIterator)findAncestorWithClass(this, PolicySetMemberIterator.class);
			pageContext.getOut().print(thePolicySetMemberIterator.getMember());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for member tag ");
		}
		return SKIP_BODY;
	}
}

