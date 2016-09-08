package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageProducedAtIterator theStillImageProducedAtIterator = (StillImageProducedAtIterator)findAncestorWithClass(this, StillImageProducedAtIterator.class);
			pageContext.getOut().print(theStillImageProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

