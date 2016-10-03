package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusTopConceptOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusTopConceptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusTopConceptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusTopConceptOfIterator theCirculationStatusTopConceptOfIterator = (CirculationStatusTopConceptOfIterator)findAncestorWithClass(this, CirculationStatusTopConceptOfIterator.class);
			pageContext.getOut().print(theCirculationStatusTopConceptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

