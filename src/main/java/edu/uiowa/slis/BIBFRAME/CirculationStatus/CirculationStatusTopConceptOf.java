package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusTopConceptOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusTopConceptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusTopConceptOfIterator theCirculationStatusTopConceptOfIterator = (CirculationStatusTopConceptOfIterator)findAncestorWithClass(this, CirculationStatusTopConceptOfIterator.class);
			pageContext.getOut().print(theCirculationStatusTopConceptOfIterator.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

