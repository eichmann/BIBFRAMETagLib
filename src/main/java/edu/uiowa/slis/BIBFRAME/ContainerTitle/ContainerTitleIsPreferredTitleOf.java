package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleIsPreferredTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleIsPreferredTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleIsPreferredTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContainerTitleIsPreferredTitleOfIterator theContainerTitleIsPreferredTitleOfIterator = (ContainerTitleIsPreferredTitleOfIterator)findAncestorWithClass(this, ContainerTitleIsPreferredTitleOfIterator.class);
			pageContext.getOut().print(theContainerTitleIsPreferredTitleOfIterator.getIsPreferredTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for isPreferredTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for isPreferredTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

