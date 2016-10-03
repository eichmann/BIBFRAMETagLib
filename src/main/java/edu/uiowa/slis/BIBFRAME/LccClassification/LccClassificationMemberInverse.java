package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationMemberInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccClassificationMemberInverseIterator theLccClassificationMemberInverseIterator = (LccClassificationMemberInverseIterator)findAncestorWithClass(this, LccClassificationMemberInverseIterator.class);
			pageContext.getOut().print(theLccClassificationMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for member tag ");
		}
		return SKIP_BODY;
	}
}

