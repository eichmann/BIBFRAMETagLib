package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccClassificationTopConceptOfIterator theLccClassificationTopConceptOfIterator = (LccClassificationTopConceptOfIterator)findAncestorWithClass(this, LccClassificationTopConceptOfIterator.class);
			pageContext.getOut().print(theLccClassificationTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

