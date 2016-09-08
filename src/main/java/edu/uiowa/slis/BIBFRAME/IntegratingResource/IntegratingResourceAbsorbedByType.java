package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceAbsorbedByIterator theIntegratingResourceAbsorbedByIterator = (IntegratingResourceAbsorbedByIterator)findAncestorWithClass(this, IntegratingResourceAbsorbedByIterator.class);
			pageContext.getOut().print(theIntegratingResourceAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

