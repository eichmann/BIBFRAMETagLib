package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkHasOriginPlaceIterator theWorkHasOriginPlaceIterator = (WorkHasOriginPlaceIterator)findAncestorWithClass(this, WorkHasOriginPlaceIterator.class);
			pageContext.getOut().print(theWorkHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

