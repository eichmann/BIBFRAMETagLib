package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ContainerTitle theContainerTitle = (ContainerTitle)findAncestorWithClass(this, ContainerTitle.class);
			if (!theContainerTitle.commitNeeded) {
				pageContext.getOut().print(theContainerTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ContainerTitle theContainerTitle = (ContainerTitle)findAncestorWithClass(this, ContainerTitle.class);
			return theContainerTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ContainerTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ContainerTitle theContainerTitle = (ContainerTitle)findAncestorWithClass(this, ContainerTitle.class);
			theContainerTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for label tag ");
		}
	}
}

