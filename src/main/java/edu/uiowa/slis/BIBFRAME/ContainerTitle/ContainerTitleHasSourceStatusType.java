package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContainerTitleHasSourceStatusIterator theContainerTitleHasSourceStatusIterator = (ContainerTitleHasSourceStatusIterator)findAncestorWithClass(this, ContainerTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theContainerTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

