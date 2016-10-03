package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccClassificationTopConceptOfIterator theLccClassificationTopConceptOfIterator = (LccClassificationTopConceptOfIterator)findAncestorWithClass(this, LccClassificationTopConceptOfIterator.class);
			pageContext.getOut().print(theLccClassificationTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

