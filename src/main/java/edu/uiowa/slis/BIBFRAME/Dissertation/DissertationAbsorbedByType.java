package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationAbsorbedByIterator theDissertationAbsorbedByIterator = (DissertationAbsorbedByIterator)findAncestorWithClass(this, DissertationAbsorbedByIterator.class);
			pageContext.getOut().print(theDissertationAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

