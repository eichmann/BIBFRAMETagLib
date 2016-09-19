package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageDerivedFromType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageDerivedFromType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageDerivedFromType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageDerivedFromIterator theStillImageDerivedFromIterator = (StillImageDerivedFromIterator)findAncestorWithClass(this, StillImageDerivedFromIterator.class);
			pageContext.getOut().print(theStillImageDerivedFromIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

