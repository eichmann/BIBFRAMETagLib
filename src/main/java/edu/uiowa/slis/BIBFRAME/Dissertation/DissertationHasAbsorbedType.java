package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasAbsorbedIterator theDissertationHasAbsorbedIterator = (DissertationHasAbsorbedIterator)findAncestorWithClass(this, DissertationHasAbsorbedIterator.class);
			pageContext.getOut().print(theDissertationHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

