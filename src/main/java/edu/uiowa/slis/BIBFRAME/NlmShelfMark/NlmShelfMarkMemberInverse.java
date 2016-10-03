package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkMemberInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMarkMemberInverseIterator theNlmShelfMarkMemberInverseIterator = (NlmShelfMarkMemberInverseIterator)findAncestorWithClass(this, NlmShelfMarkMemberInverseIterator.class);
			pageContext.getOut().print(theNlmShelfMarkMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for member tag ");
		}
		return SKIP_BODY;
	}
}

