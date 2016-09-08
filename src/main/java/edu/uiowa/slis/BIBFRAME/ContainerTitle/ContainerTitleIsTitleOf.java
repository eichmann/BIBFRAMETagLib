package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleIsTitleOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleIsTitleOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleIsTitleOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContainerTitleIsTitleOfIterator theContainerTitleIsTitleOfIterator = (ContainerTitleIsTitleOfIterator)findAncestorWithClass(this, ContainerTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theContainerTitleIsTitleOfIterator.getIsTitleOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

