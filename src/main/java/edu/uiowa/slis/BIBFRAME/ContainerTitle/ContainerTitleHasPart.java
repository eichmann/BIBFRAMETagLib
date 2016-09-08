package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContainerTitleHasPartIterator theContainerTitleHasPartIterator = (ContainerTitleHasPartIterator)findAncestorWithClass(this, ContainerTitleHasPartIterator.class);
			pageContext.getOut().print(theContainerTitleHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

