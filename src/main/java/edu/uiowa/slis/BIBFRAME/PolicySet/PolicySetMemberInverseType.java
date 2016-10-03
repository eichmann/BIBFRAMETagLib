package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetMemberInverseIterator thePolicySetMemberInverseIterator = (PolicySetMemberInverseIterator)findAncestorWithClass(this, PolicySetMemberInverseIterator.class);
			pageContext.getOut().print(thePolicySetMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for member tag ");
		}
		return SKIP_BODY;
	}
}

