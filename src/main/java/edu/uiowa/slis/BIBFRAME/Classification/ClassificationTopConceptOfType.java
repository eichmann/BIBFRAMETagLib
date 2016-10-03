package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationTopConceptOfIterator theClassificationTopConceptOfIterator = (ClassificationTopConceptOfIterator)findAncestorWithClass(this, ClassificationTopConceptOfIterator.class);
			pageContext.getOut().print(theClassificationTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

