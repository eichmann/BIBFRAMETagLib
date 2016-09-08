package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleIsTitleOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleIsTitleOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleIsTitleOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContainerTitleIsTitleOfIterator theContainerTitleIsTitleOfIterator = (ContainerTitleIsTitleOfIterator)findAncestorWithClass(this, ContainerTitleIsTitleOfIterator.class);
			pageContext.getOut().print(theContainerTitleIsTitleOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for isTitleOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for isTitleOf tag ");
		}
		return SKIP_BODY;
	}
}

