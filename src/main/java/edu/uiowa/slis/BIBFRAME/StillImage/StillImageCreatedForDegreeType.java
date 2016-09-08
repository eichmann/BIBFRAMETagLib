package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageCreatedForDegreeIterator theStillImageCreatedForDegreeIterator = (StillImageCreatedForDegreeIterator)findAncestorWithClass(this, StillImageCreatedForDegreeIterator.class);
			pageContext.getOut().print(theStillImageCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

