package edu.uiowa.slis.BIBFRAME.Classification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassificationIsClassificationForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ClassificationIsClassificationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassificationIsClassificationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassificationIsClassificationForIterator theClassificationIsClassificationForIterator = (ClassificationIsClassificationForIterator)findAncestorWithClass(this, ClassificationIsClassificationForIterator.class);
			pageContext.getOut().print(theClassificationIsClassificationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Classification for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Classification for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

