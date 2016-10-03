package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationTopConceptOfIterator theDdcClassificationTopConceptOfIterator = (DdcClassificationTopConceptOfIterator)findAncestorWithClass(this, DdcClassificationTopConceptOfIterator.class);
			pageContext.getOut().print(theDdcClassificationTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

