package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasAbsorbedIterator theIntegratingResourceHasAbsorbedIterator = (IntegratingResourceHasAbsorbedIterator)findAncestorWithClass(this, IntegratingResourceHasAbsorbedIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

