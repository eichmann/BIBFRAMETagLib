package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmClassificationMemberInverseIterator theNlmClassificationMemberInverseIterator = (NlmClassificationMemberInverseIterator)findAncestorWithClass(this, NlmClassificationMemberInverseIterator.class);
			pageContext.getOut().print(theNlmClassificationMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for member tag ");
		}
		return SKIP_BODY;
	}
}

