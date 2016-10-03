package edu.uiowa.slis.BIBFRAME.CirculationStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CirculationStatusMemberInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CirculationStatusMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CirculationStatusMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CirculationStatusMemberInverseIterator theCirculationStatusMemberInverseIterator = (CirculationStatusMemberInverseIterator)findAncestorWithClass(this, CirculationStatusMemberInverseIterator.class);
			pageContext.getOut().print(theCirculationStatusMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CirculationStatus for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing CirculationStatus for member tag ");
		}
		return SKIP_BODY;
	}
}

