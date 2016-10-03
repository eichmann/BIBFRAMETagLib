package edu.uiowa.slis.BIBFRAME.NlmClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmClassificationTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmClassificationTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmClassificationTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NlmClassificationTopConceptOfIterator theNlmClassificationTopConceptOfIterator = (NlmClassificationTopConceptOfIterator)findAncestorWithClass(this, NlmClassificationTopConceptOfIterator.class);
			pageContext.getOut().print(theNlmClassificationTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing NlmClassification for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmClassification for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

