package edu.uiowa.slis.BIBFRAME.Motivation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MotivationMemberInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MotivationMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MotivationMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MotivationMemberInverseIterator theMotivationMemberInverseIterator = (MotivationMemberInverseIterator)findAncestorWithClass(this, MotivationMemberInverseIterator.class);
			pageContext.getOut().print(theMotivationMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Motivation for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Motivation for member tag ");
		}
		return SKIP_BODY;
	}
}

